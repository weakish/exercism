# I assume scores is a list,
# that is, the caller of these three functions will only invoke them with Iterable<Comparable>.


def latest(scores):
    from collections import deque
    # assuming the last added score is appended at the end.
    zero_or_one_element_double_ended_queue = deque(scores, maxlen=1)
    try:
        latest_score = zero_or_one_element_double_ended_queue.pop()
    except IndexError:  # empty
        return None
    else:
        return latest_score


def personal_best(scores):
    return max(scores, default=None)


def personal_top_three(scores):
    return sorted(scores, reverse=True)[:3]
