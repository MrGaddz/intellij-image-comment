package com.github.mrgaddz.intellijimagecomment.services

import com.github.mrgaddz.intellijimagecomment.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
