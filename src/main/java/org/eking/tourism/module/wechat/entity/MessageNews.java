package org.eking.tourism.module.wechat.entity;

import java.util.List;

/**
* 图文消息类
* @Author wangyu
* @Date 2018/3/21
*/
public class MessageNews extends BaseMessage {

    private int ArticleCount;//文章数量

    private List<News> Articles;//文章列表

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<News> getArticles() {
        return Articles;
    }

    public void setArticles(List<News> articles) {
        Articles = articles;
    }
}
