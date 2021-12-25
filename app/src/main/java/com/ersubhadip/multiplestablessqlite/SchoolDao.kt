package com.ersubhadip.multiplestablessqlite

import androidx.room.*
import com.ersubhadip.multiplestablessqlite.Entities.*
import com.ersubhadip.multiplestablessqlite.Entities.Relations.SchoolAndDirector
import com.ersubhadip.multiplestablessqlite.Entities.Relations.SchoolWithStudents
import com.ersubhadip.multiplestablessqlite.Entities.Relations.StudentWithSubject
import com.ersubhadip.multiplestablessqlite.Entities.Relations.SubjectWithStudent

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(schools: Schools)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subjects: Subjects)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: SubjectStudentCrossRef)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("SELECT * FROM schools WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorBySchoolName(schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM schools WHERE schoolName = :schoolName")
    suspend fun getStudentAndSchoolBySchoolName(schoolName: String): List<SchoolWithStudents>

    @Transaction
    @Query("SELECT * FROM student WHERE studentName = :studentName")
    suspend fun getStudentsOfSubject(studentName:String):List<StudentWithSubject>

    @Transaction
    @Query("SELECT * FROM subjects WHERE subjectName = :subjectName")
    suspend fun getSubjectsOfStudent(subjectName: String):List<SubjectWithStudent>


}