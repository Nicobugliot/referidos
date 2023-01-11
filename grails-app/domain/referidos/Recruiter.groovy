package referidos

class Recruiter {
    String name
    Long dni
    String contactInformation
    String department
    List<Postulation> postulations

    static hasMany = [postulations: Postulation]

    static constraints = {
    }
}
