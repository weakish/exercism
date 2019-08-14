def latest(scores):
    # Assumes the last added score is appended at the end.
    # Does not distinguish between:
    #
    # 1. a player who have not finished at least one game (scores list is empty).
    # 2. a player got zero on the last game they played.
    #
    # I think this is not very rigid, but acceptable.
    # I have seen quite a lot of games displaying zeros on score list for new players.
    return scores[-1] if scores else 0


def personal_best(scores):
    return max(scores, default=0)


def personal_top_three(scores):
    return sorted(scores, reverse=True)[:3]
