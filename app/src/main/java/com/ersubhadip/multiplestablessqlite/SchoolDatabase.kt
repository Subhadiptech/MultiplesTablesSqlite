package com.ersubhadip.multiplestablessqlite

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ersubhadip.multiplestablessqlite.Entities.*
import java.time.Instant

@Database(
    entities = [Schools::class, Student::class, Director::class, Subjects::class, SubjectStudentCrossRef::class],
    version = 1,
    exportSchema = false
)
abstract class SchoolDatabase() : RoomDatabase() {

    abstract val dao: SchoolDao

    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getDatabase(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }

}