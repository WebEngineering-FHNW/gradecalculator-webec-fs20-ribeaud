package webec

// See https://gsp.grails.org/latest/guide/taglibs.html
class DecorationTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = "webec"

    def decorate = { attibutes, body ->
        String decor = ''
        try {
            int grade = Float.parseFloat(attibutes.grade)
            if (grade >= 4) {
                decor = ' :-)'
            } else {
                decor = ' :-('
            }
        } catch (NumberFormatException e) {
            // Ignore!
        }
        out << body()
        out << decor
    }
}
