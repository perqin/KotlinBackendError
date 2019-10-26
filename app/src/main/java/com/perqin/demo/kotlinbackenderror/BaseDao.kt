package com.perqin.demo.kotlinbackenderror

import androidx.room.Delete
import androidx.room.Insert

interface BaseDao<E> {
    @Insert
    fun insertAll(entities: List<E>)

    @Delete
    fun deleteAll(entities: List<E>)
}
