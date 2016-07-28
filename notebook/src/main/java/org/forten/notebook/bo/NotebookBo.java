package org.forten.notebook.bo;

import org.forten.notebook.dao.JdbcDao;
import org.forten.notebook.model.Notebook;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/28.
 */
@Service("notebookBo")
public class NotebookBo {
    @Resource
    private JdbcDao jdbcDao;

    @Transactional
    public int doSave(Notebook nb) {
        String sql = "INSERT INTO test_notebook (title,content,create_time) VALUE (:t,:c,:ct)";
        Map<String, Object> params = new HashMap<>();
        params.put("t", nb.getTitle());
        params.put("c", nb.getContent());
        params.put("ct", nb.getCreateTime());

        return jdbcDao.update(sql, params);
    }

    @Transactional(readOnly = true)
    public List<Notebook> queryAll() {
        String sql = "SELECT id,title,content,create_time FROM test_notebook ORDER BY create_time DESC";
        return jdbcDao.findBy(sql, new HashMap<String, Object>(), (rs, i) -> {
            Notebook n = new Notebook();
            n.setId(rs.getInt("id"));
            n.setTitle(rs.getString("title"));
            n.setContent(rs.getString("content"));
            n.setCreateTime(rs.getDate("create_time"));

            return n;
        });
    }
}
