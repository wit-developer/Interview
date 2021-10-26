package com.mokw.interview

data class Author(
    val userName: String,
    val userId: Long,
    val userProfilePath: String,
    val userBio: String
)

data class Content(
    val contentId: Long,
    val contentTitle: String,
    val contentDesc: String,
    val contentCoverPath: String
)

data class SearchResp(
    val popularTags: List<String>, // 인기 태그를 보여 줄 때 사용
    val recommendAuthors: List<Author>, // 추천 유저를 보여 줄 때 사용
    val contents: List<Content>, // 하단 컨텐츠 리스트를 보여줄 때 사용
    val allowMore: Boolean, // 더이상 로드할 하단 컨텐츠가 있는지
    val lastContentId: Long // 마지막까지 로드한 하단 컨텐츠의 id값
)

data class LoadResp(
    val contentList: List<Content>,
    val lastContentId: Long,
    val allowMore: Boolean
)