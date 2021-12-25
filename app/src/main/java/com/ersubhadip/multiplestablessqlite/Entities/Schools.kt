package com.ersubhadip.multiplestablessqlite.Entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Schools(

   @PrimaryKey(autoGenerate = false)
   val schoolName:String
)
