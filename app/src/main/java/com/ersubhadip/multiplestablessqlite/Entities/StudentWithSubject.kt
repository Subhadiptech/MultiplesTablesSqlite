package com.ersubhadip.multiplestablessqlite.Entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class StudentWithSubject(

    @Embedded val student: Student,

    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(SubjectStudentCrossRef::class)
    )
    val subjects: List<Subjects>

)
