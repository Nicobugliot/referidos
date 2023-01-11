package referidos

import referidos.enums.VacantState

class Vacant {
    VacantState state
    Recluter recluter
    String title
    String description
    String requiredSkills
    List<Postulation> postulations

    static constraints = {
    }
}
