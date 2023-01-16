def solution(n, times):
    answer = 0
    left = 1
    right = max(times) * n
    while left <= right:
        mid = (left + right) // 2
        s = 0
        for time in times:
            s += mid // time
            if s >= n:
                break
        if s >= n:
            answer = mid
            right = mid - 1
        elif s < n:
            left = mid + 1

    return answer
