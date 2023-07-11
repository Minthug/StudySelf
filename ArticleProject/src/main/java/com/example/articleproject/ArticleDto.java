package com.example.articleproject;

import java.io.Serializable;
import java.time.LocalDateTime;

public record ArticleDto (
        String title,
        String content,
        String hashtag,
        LocalDateTime createdAt,
        String createBy,
        LocalDateTime modifiedAt,
        String modifiedBy
) implements Serializable {

}
