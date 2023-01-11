package referidos

import referidos.enums.PostulationState

class Postulation {
    PostulationState postulationState
    Referred referred
    Vacant vacant
    Date referredDate
    Date interviewedDate
    Boolean accepted
    Recluter recluter

    static belongsTo = [recluter: Recluter, referred: Referred, vacant: Vacant]

    static constraints = {
    }
}
