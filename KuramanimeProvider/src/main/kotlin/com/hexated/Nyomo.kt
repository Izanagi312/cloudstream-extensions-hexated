package com.hexated

import com.lagradost.cloudstream3.extractors.StreamSB

class Nyomo : StreamSB() {
    override var name: String = "Nyomo"
    override var mainUrl = "https://nyomo.my.id"
}

class Streamhide : StreamSB() {
    override var name: String = "Streamhide"
    override var mainUrl: String = "https://streamhide.to"
}