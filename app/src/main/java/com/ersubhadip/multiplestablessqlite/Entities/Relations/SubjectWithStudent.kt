package com.ersubhadip.multiplestablessqlite.Entities.Relations

import androidx.annotation.RequiresPermission
import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.ersubhadip.multiplestablessqlite.Entities.Student
import com.ersubhadip.multiplestablessqlite.Entities.SubjectStudentCrossRef
import com.ersubhadip.multiplestablessqlite.Entities.Subjects

data class SubjectWithStudent(

    @Embedded val subjects: Subjects,

    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(SubjectStudentCrossRef::class)
    )
    val students: List<Student>


)
