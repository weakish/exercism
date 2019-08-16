class NotFinishOneGameYetException(Exception):
    """Raised when player has not finished at least one game yet."""
    pass


def latest(scores):
    # Assumes the last added score is appended at the end.
    try:
        latest_score = scores[-1]
    except IndexError:
        raise NotFinishOneGameYetException()
    else:
        return latest_score


def personal_best(scores):
    try:
        best_score = max(scores)
    except ValueError:
        raise NotFinishOneGameYetException()
    else:
        return best_score


def personal_top_three(scores):
    return sorted(scores, reverse=True)[:3]
