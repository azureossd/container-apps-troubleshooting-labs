# container-apps-elx-labs

This repository hosts various labs for troubleshooting and solving problems, specifically for Container Apps. Each lab folder's `READMNE.md` has a "click to deploy" button which can easily deploy the associated lab in the respective folder.

Scenarios:
- `01`: A customer has deployed a basic application, but is seeing the application get stuck on "Activating" and eventually the Revision is marked as `Failed`. Trying to access the FQDN of the application returns a 503 or `stream timeout`
  - What steps are achieved to resolve this?
  - What best practices can be done to avoid this in the future?

- `02`: A customer has deployed an application that has a very long startup routine, which takes roughly 250 seconds to complete before it's accessible. Although the application does start and run fine, revisions end up being marked as `Failed`
  - Why is this happening?
  - How can you resolve it?
  - How would you investigate what's causing this? What would you do or use to look at further information?

- `03`: A customer is deploying a new environment. They can access the application, and even though its not "down" - they notice the Revision is marked as "Degraded"
  - Why is this? What is causing it?
  - How would you resolve this?
  - What are some best practices for this?

