package com.learn.demospringaudit.contexts.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.learn.demospringaudit.contexts.models.BookInfo;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BooksResponse extends BaseResponse {
    @JsonProperty("data")
    private List<BookInfo> bookInfos;
}
