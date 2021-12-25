package com.ersubhadip.multiplestablessqlite.Entities.Relations

import androidx.room.Embedded
import androidx.room.Relation
import com.ersubhadip.multiplestablessqlite.Entities.Schools
import com.ersubhadip.multiplestablessqlite.Entities.Student

data class SchoolWithStudents(
    //Schools is the parent table
     @Embedded val schools: Schools,

     @Relation(
         parentColumn = "schoolName",
         entityColumn = "schoolName"
     )
     val student: List<Student>
)
