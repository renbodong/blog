package com.zq.blogbusinessprovider.web;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.zq.blogbusinessapi.dubboapi.ArticleDubboApi;
import com.zq.blogbusinessapi.pojo.Article;
import com.zq.blogbusinessapi.service.ArticleService;
import com.zq.blogbusinessapi.vo.ArticleVo;
import com.zq.blogcommon.utils.BaseRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/11/15 22:52
 */
@RequestMapping
@Service(version = "${demo.service.version}")
public class ArticleWeb implements ArticleDubboApi {
    @Resource
    ArticleService articleService;
    @Override
    public BaseRes<List<Article>> queryArticleLists(ArticleVo articleVo) {
        BaseRes<List<Article>> res = null;
        List<Article> articleList = articleService.queryArticleLists(articleVo);
        res.setData(articleList);
        res.setCount(articleList.size());
        return res;
    }
}
