package com.melaniedura.imagesearchapp.api

import com.melaniedura.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    var results: List<UnsplashPhoto>
)