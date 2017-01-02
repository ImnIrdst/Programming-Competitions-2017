# https://www.hackerrank.com/challenges/non-divisible-subset

line_tokens = raw_input().split()
n = int(line_tokens[0])
k = int(line_tokens[1])

if k == 1:
	print 1
	exit()

line_tokens = raw_input().split()
a = [int(x) for x in line_tokens]

reminders = [0 for i in range(0, k)]

for ai in a:
	reminders[ai%k] += 1
	# print 'ai: %d, ai mod k: %d' % (ai, ai%k)

if k%2 == 0:
	reminders[k/2] = 1

ans = min(1, reminders[0])
for i in range(1, k/2+1):
	ans += max(reminders[i], reminders[k-i])

# print reminders

print ans
