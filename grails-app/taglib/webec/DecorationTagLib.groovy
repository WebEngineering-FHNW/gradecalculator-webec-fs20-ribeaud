package webec

// See https://gsp.grails.org/latest/guide/taglibs.html
class DecorationTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = "webec"

    def decorate = { attibutes, body ->
        int grade = Float.parseFloat(attibutes.grade)
        String decor = ''
        if (grade >= 4) {
            decor = ' :-)'
        } else {
            decor = ' :-('
        }
        out << body()
        out << decor
    }
}
