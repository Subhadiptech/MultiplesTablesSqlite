package com.ersubhadip.multiplestablessqlite.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subjects(

    @PrimaryKey(autoGenerate = false)
    val subjectName:String
)
