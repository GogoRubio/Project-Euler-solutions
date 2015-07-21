# 
# Solution to Project Euler problem 40
# by Project Nayuki
# 
# http://www.nayuki.io/page/project-euler-solutions
# https://github.com/nayuki/Project-Euler-solutions
# 


s = "".join(str(i) for i in range(1, 1000000))
ans = 1
for i in range(7):
	ans *= int(s[10**i - 1])
print(ans)
