package com.zq.blogbusinessapi.dubboapi;

import com.zq.blogbusinessapi.pojo.Article;
import com.zq.blogbusinessapi.vo.ArticleVo;
import com.zq.blogcommon.utils.BaseRes;

import java.util.List;

/**
 * Created by Administrator on 2019/11/15 23:02
 */
public interface ArticleDubboApi {
    public BaseRes<List<Article>> queryArticleLists(ArticleVo articleVo);
}
