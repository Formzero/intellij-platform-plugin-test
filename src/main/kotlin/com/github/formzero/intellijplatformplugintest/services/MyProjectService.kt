package com.github.formzero.intellijplatformplugintest.services

import com.intellij.openapi.project.Project
import com.github.formzero.intellijplatformplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
