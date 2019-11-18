package com.zq.blogbusinessprovider.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zq.blogbusinessapi.pojo.Article;
import com.zq.blogbusinessapi.service.ArticleService;
import com.zq.blogbusinessapi.vo.ArticleVo;
import com.zq.blogbusinessprovider.dao.ArticleMapper;
import com.zq.blogcommon.utils.BaseRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rbd
 * @since 2019-11-14
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> queryArticleLists(ArticleVo articleVo) {
        return articleMapper.queryArticleLists(articleVo);
    }
}
