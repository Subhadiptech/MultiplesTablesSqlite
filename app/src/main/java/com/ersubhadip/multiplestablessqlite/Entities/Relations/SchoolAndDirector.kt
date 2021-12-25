package com.ersubhadip.multiplestablessqlite.Entities.Relations

import androidx.room.Embedded
import androidx.room.Relation
import com.ersubhadip.multiplestablessqlite.Entities.Director
import com.ersubhadip.multiplestablessqlite.Entities.Schools

//Combining 1 to 1 relations

data class SchoolAndDirector(
    @Embedded val schools: Schools,

    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)
