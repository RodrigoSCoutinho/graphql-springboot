package br.com.rodrigoscoutinho.graphqlspringboot.modules.category;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CategoryEntity {

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    public CategoryEntity(String name) {
        this.name = name;
    }
}