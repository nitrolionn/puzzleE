package com.puzzle.model.mapper;

/**
 * Maps instances of entity type Entity to instances of model type Model.
 *
 * @param <Entity> entity type.
 * @param <Model> model type.
 */
public interface MapperToDto<Entity, Model> {
    /**
     * @param entity POJO entity to convert.
     * @return json model.
     */
    Model toDto(Entity entity);
}
