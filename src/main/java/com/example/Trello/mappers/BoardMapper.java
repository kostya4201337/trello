package com.example.Trello.mappers;

import com.example.Trello.model.entity.BoardEntity;
import com.example.Trello.model.dto.board.BoardCreation;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper {
    public BoardEntity map(final BoardCreation boardCreation) {
        return BoardEntity
                .builder()
                .name(boardCreation.name())
                .description(boardCreation.description())
                .build();
    }
}
