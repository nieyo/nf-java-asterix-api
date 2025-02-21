package org.example.nfjavaasterixapi;

import lombok.With;
import org.springframework.data.annotation.Id;

// @Document("character")
@With
public record Character(
        @Id String id,
        String name,
        int age,
        String profession
) {
}
