# Incident
2 oldest outstanding bills

# Description

Application maintenance reported that user would like to reinstate life insurance policy but found reinstate amount is incorrect. The incident prevents user from paying outstanding bills to reinstate insurance policy.

# Approach

1. Obtained business logic from business analyst and found that reinstate amount equals total amount of 2 oldest outstanding bills.
2. Analzed the existing code and found billing info comes from another application in rest API payload. Inside the payload, bills are represented as a list in chronological order from the newest bill to the oldest bill. The existing code takes 1st 2 outstadning bill (aka 2 newest outstanding bill) as reinstate amount instead.
3. Remedied the defect with java collection framework to reverse bill order from newest first to oldest first and take the 2 oldest outstanding bills amount as reinstate amount.
4. Deployed the patch in Dev, QA, UAT, and production environment thru CICD pipeline to get the business signoff.
