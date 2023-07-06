package com.example.articleproject.domain;


import java.time.LocalDateTime;

// 단수 설계중
public class ArticleComment {
    private Long id;
    private Article article;  // 게시글(ID)
    private String content;  //본문

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
