package com.ersubhadip.multiplestablessqlite.Entities

import androidx.room.Entity

@Entity(primaryKeys = ["studentName","subjectName"])
data class SubjectStudentCrossRef(
    val studentName: String,
    val subjectName: String
)
