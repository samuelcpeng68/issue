# Incident
two oldest outstanding bills

# Description

Application maintenance reported that user would like to reinstate life insurance policy but found reinstate amount is incorrect. The incident prevents user from paying outstanding bills to reinstate insurance policy.

# Approach

1. Obtained business logic from business analyst and found that reinstate amount equals total amount of two oldest outstanding bills.
2. Analzed the existing code and found billing info comes from another application in rest API payload. Inside the payload, bills are represented as a list in chronological order from the newest bill to the oldest bill. The existing code takes 1st two outstadning bills (which are two newest outstanding bills) as reinstate amount instead.
3. Remedied the defect with java collection framework by reversing bills order and take the 1st two outstanding bills (which are two oldest outstanding bills) as reinstate amount.
4. Deployed the patch in Dev, QA, UAT, and production environment thru CICD pipeline to get the business signoff.
