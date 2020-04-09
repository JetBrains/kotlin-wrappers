plugins {
    kotlin("js")
    `npm-publishing-conventions`
}

dependencies {
    compile(project(":kotlin-css"))
    compile(project(":kotlin-css:kotlin-css-js"))
    compile(project(":kotlin-react-dom"))
}
