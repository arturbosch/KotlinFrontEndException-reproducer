package com.github.arturbosch.kotlinfrontendexceptionreproducer.services

import com.axivion.client_data_processing.issue_data_source.IssueKind
import com.github.arturbosch.kotlinfrontendexceptionreproducer.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))
        println(IssueKind.values())
    }
}
