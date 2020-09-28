package com.github.wangyangcsc.gitcommitideaplugin.services

import com.intellij.openapi.project.Project
import com.github.wangyangcsc.gitcommitideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
