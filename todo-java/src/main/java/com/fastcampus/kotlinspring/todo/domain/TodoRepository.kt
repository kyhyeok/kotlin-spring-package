package com.fastcampus.kotlinspring.todo.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : JpaRepository<Todo, Long> {
    fun findAllByDoneIsFalseOrderByIdDesc() : List<Todo>?
}