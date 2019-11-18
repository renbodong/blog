package com.zq.blogbusinessprovider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zq.blogbusinessapi.pojo.Article;
import com.zq.blogbusinessapi.vo.ArticleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  ArticleMapper 接口
 * </p>
 *
 * @author rbd
 * @since 2019-11-14
 */

public interface ArticleMapper extends BaseMapper<Article> {

    public List<Article> queryArticleLists(@Param("articleVo") ArticleVo articleVo);

}
