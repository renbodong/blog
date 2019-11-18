package com.zq.blogbusinessapi.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zq.blogbusinessapi.pojo.Article;
import com.zq.blogbusinessapi.vo.ArticleVo;
import com.zq.blogcommon.utils.BaseRes;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rbd
 * @since 2019-11-14
 */
public interface ArticleService extends IService<Article> {
    public List<Article> queryArticleLists(ArticleVo articleVo);

}
