package com.chobo.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "marts")
data class MartEntity(
    @PrimaryKey(autoGenerate = true) // autoGenerate = true: 이 옵션을 사용하면 Room이 자동으로 데이터베이스에 새로운 엔티티를 삽입할 때마다 자동으로 증가하는 기본 키 값을 할당한다
    val id: Long = 0,
    val name: String,
    val location : String,
    val tag1 : String,
    val tag2 : String,
    val url: String,
)