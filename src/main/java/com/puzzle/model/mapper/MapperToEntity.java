package com.puzzle.model.mapper;

/**
 * Maps instances of dto type Model to instances of entity type Entity.
 *
 * @param <Model> model type.
 * @param <Entity> entity type.
 */
public interface MapperToEntity<Model, Entity> {
    /**
     * @param dto json model to convert.
     * @return POJO entity.
     */
    Entity toEntity(Model dto);
}
