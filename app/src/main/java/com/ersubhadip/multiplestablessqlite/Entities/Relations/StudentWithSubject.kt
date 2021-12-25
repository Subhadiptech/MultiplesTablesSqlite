package com.ersubhadip.multiplestablessqlite.Entities.Relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.ersubhadip.multiplestablessqlite.Entities.Student
import com.ersubhadip.multiplestablessqlite.Entities.SubjectStudentCrossRef
import com.ersubhadip.multiplestablessqlite.Entities.Subjects

data class StudentWithSubject(

    @Embedded val student: Student,

    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(SubjectStudentCrossRef::class)
    )
    val subjects: List<Subjects>

)
