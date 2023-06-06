package br.senai.sp.jandira.lion_school.service

import br.senai.sp.jandira.lion_school.model.Course
import br.senai.sp.jandira.lion_school.model.CourseList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path

interface CourseService {

    @GET("cursos")
    fun getCourses(): Call<Course>

    @GET("alunos?curso={sigla}")
    fun getCursoDs(@Path("sigla") sigla: Int): Call<br.senai.sp.jandira.lion_school.model.Course>
    fun enqueue(callback: Callback<CourseList>)

}