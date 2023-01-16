package com.learn.demospringaudit.contexts.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.learn.demospringaudit.contexts.models.BookInfo;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse extends BaseResponse {
    @JsonProperty("data")
    private BookInfo bookInfo;
}
