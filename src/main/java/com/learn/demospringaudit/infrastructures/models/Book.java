package com.learn.demospringaudit.infrastructures.models;

import com.google.gson.Gson;
import com.learn.demospringaudit.audit.models.Auditable;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "test_audit", name = "book")
@EntityListeners(AuditingEntityListener.class)
public class Book extends Auditable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "is_active")
    private boolean isActive;

    public String toString() {
        return new Gson().toJson(this);
    }
}
