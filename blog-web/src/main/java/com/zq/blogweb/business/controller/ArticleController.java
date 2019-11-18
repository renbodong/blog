package com.zq.blogweb.business.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.zq.blogbusinessapi.dubboapi.ArticleDubboApi;
import com.zq.blogbusinessapi.pojo.Article;
import com.zq.blogbusinessapi.vo.ArticleVo;
import com.zq.blogcommon.utils.BaseRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rbd
 * @since 2019-11-14
 */
@RestController
@RequestMapping("/article")
@Api(value = "/article",tags = {"文章接口层"})
public class ArticleController {
    @Reference(version = "${demo.service.version1}")
    ArticleDubboApi articleDubboApi;
    @RequestMapping(value = "/queryArticleLists",method = RequestMethod.POST)
    @ApiOperation(value = "查询文章列表接口",httpMethod = "POST",notes = "11")
    public BaseRes<List<Article>> queryArticleLists(@RequestBody ArticleVo articleVo){
        BaseRes<List<Article>> res = articleDubboApi.queryArticleLists(articleVo);
        return res;
    }

}

